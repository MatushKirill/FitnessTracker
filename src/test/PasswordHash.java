import junit.framework.TestCase;
import org.springframework.security.authentication.encoding.Md5PasswordEncoder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * Created by kirill on 07/10/16.
 */
public class PasswordHash extends TestCase {

    public void testBCryptHash(){
        String password="admin";
        BCryptPasswordEncoder passwordEncoder=new BCryptPasswordEncoder();
        String hashPassword=passwordEncoder.encode(password);
        System.out.println(hashPassword);
    }

    public void testMD5Hash(){
        String password="456";
        Md5PasswordEncoder passwordEncoder=new Md5PasswordEncoder();
        String hashPassword=passwordEncoder.encodePassword(password,null);
        System.out.println(hashPassword);
    }
}
