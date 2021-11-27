/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai3;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

/**
 *
 * @author Thang
 */
public class MulticastImageSender {

    /**
     * @param args the command line arguments
     */
    private static final int timeout=3000;
    private static final int maxfilelen=65000; // kích thước file ảnh
    public static void main(String[] args) throws IOException,InterruptedException
    {
       if(args.length<4)
       throw new IllegalArgumentException("Parameter(s):<Multicast Address> <Port> <TTL> <Image File>[<Image File>...]");
           InetAddress multicastAddress= InetAddress.getByName(args[0]);
           int destPort = Integer.parseInt(args[1]); //cổng
           int TTL =  Integer.parseInt(args[2]);    //nhập TTL
           
           MulticastSocket socket = new MulticastSocket();
           socket.setTimeToLive(TTL);
           for(int i=3;i<args.length;i++)
           {
               RandomAccessFile file = new RandomAccessFile(args[i], "r");
               if(file.length()> maxfilelen)
                   throw  new IOException("File's too big");
               byte[] fileBuffer = new byte[(int) file.length()];
               file.read(fileBuffer);
               file.close();
               DatagramPacket sendPacket = new DatagramPacket(fileBuffer,fileBuffer.length, multicastAddress, destPort);
               socket.send(sendPacket);
               System.out.println("Sent "+args[i]+ " to "+sendPacket.getAddress().getHostAddress()+" on port "+sendPacket.getPort());
               Thread.sleep(timeout);
           }
       socket.close();
    }
    
}
