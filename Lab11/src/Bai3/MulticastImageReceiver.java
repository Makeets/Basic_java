/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai3;

import java.awt.Dimension;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

/**
 *
 * @author Thang
 */
public class MulticastImageReceiver extends JFrame {
    private JLabel picture;
    public MulticastImageReceiver()
    {
        super("Multicast Image Receiver"); //tiêu đề
        setSize(300, 300); //size của window
        picture = new JLabel("No image", SwingConstants.CENTER);
        JScrollPane scrollPane = new JScrollPane(picture);
        getContentPane().add(scrollPane, "Center");
        addWindowListener(new WindowAdapter()
        {   public void windowClosing(WindowEvent evt)
                    {
                    System.exit(0);
                    }
                });
    }
     public JLabel getPicture()
        {
            return picture;
        }
     public static void main(String[] args) throws IOException {
         if(args.length !=2)
             throw new IllegalArgumentException("Parameter(s): <Multicast Address> <Port>");
             final InetAddress multicastAddress = InetAddress.getByName(args[0]);
             if (!multicastAddress.isMulticastAddress())
                 throw new IllegalArgumentException("Not a multicast address");
             int port = Integer.parseInt(args[1]); 
             MulticastImageReceiver multicastImageReceiver = new MulticastImageReceiver();
             multicastImageReceiver.setVisible(true);
              new Thread(new MulticastImageReceiverThread(multicastImageReceiver,multicastAddress, port,"No Image")).start();
    }
}
class MulticastImageReceiverThread implements Runnable
{
     private static final int MAXFILELEN = 65000;
     private InetAddress multicastAddress; 
     private int port; 
     Runnable updateImage;
     String imageText; 
     byte[] image = new byte[MAXFILELEN];
     boolean imageValid = false; 
      public MulticastImageReceiverThread(final MulticastImageReceiver frame,InetAddress multicastAddress, int port, String initialImageText) 
      {
          this.multicastAddress = multicastAddress;
          this.port = port;
           this.imageText = initialImageText;
           updateImage = new Runnable()
                   {
                       public void run() 
                        {
                               JLabel picture = frame.getPicture();
                                picture.setText(imageText);
                                if (imageValid)
                                {
                                    ImageIcon newImage = new ImageIcon(image);
                                     picture.setIcon(newImage);
                                     picture.setPreferredSize(new Dimension(newImage.getIconWidth(),newImage.getIconHeight()));


                                }
                                else
                                    picture.setIcon(null);
                                    picture.revalidate();
                        }
                   };
      }
        public void changeImage()
        {
            try
            {
                SwingUtilities.invokeAndWait(updateImage);
            }
            catch(Exception e)
            {
                System.out.println(e.getMessage());
            }
        }

    @Override
    public void run() {
        DatagramPacket recvPacket = new DatagramPacket(image, MAXFILELEN);
        MulticastSocket socket;
        try
        {
            socket = new MulticastSocket(port);
            socket.joinGroup(multicastAddress);
        }
        catch(IOException e)
        {
            imageText = "Problem with multicast socket";
            imageValid = false;
            changeImage();
            return;
        }
        for (;;)
        {
            try
            {
                socket.receive(recvPacket);
            }
            catch(IOException e)
            {
                break; 
            }
            imageText = "";
            imageValid = true;
            changeImage();
            recvPacket.setLength(MAXFILELEN); 
        }
    }
}
