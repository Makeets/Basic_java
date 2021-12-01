/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RSA;
import java.io.FileInputStream;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.Base64;
import javax.crypto.Cipher;
/**
 *
 * @author Thang
 */
public class GiaMa {
    public static void main(String[] args) {
		try {
			// Đọc file chứa private key
			FileInputStream fis = new FileInputStream("D:/privateKey.rsa");
			byte[] b = new byte[fis.available()];
			fis.read(b);
			fis.close();

			// Tạo private key
			PKCS8EncodedKeySpec spec = new PKCS8EncodedKeySpec(b);
			KeyFactory factory = KeyFactory.getInstance("RSA");
			PrivateKey priKey = factory.generatePrivate(spec);

			// Giải mã dữ liệu
			Cipher c = Cipher.getInstance("RSA");
			c.init(Cipher.DECRYPT_MODE, priKey);
			byte decryptOut[] = c.doFinal(Base64.getDecoder().decode(
					"fboBgjGrSyeR3SudXVkzv6mckmePb+z0yFPChU6ZuQEndD2fhqHVfZeIbMnjp4CDmqKWX8U2ZP6Ca5OzyM0EjrwRYohAlhXvtTyVbsYv/W41NmjiAJSJpHDAkvCWPEH5pjtgOHZoNeEdO21srlFOfg/NQyU3OFXfY7Dw1bCh9PQ="));
			System.out.println("Dữ liệu sau khi giải mã: " + new String(decryptOut));
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
