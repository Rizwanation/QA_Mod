package UI.TestCases;

import UI.PageObjects.PO_RS_TeachAble;
import UI.PageObjects.TrendMicro;
import org.openqa.selenium.Cookie;
import org.testng.annotations.Test;

import java.io.*;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class UI_CookiesTest extends base{

    @Test
    public void ALoginGetCookies()
    {

        driver.get("https://sso.teachable.com/secure/9521/identity/login");

        if (driver.getTitle().startsWith("Trend")) {


            TrendMicro tm = new TrendMicro(driver);

            tm.setusername("mrizwan@nisum.com");
            tm.clickLogin1();
            tm.setPassword("FastFast#1234");
            tm.clickLogin2();
        }

        PO_RS_TeachAble pg = new PO_RS_TeachAble(driver);

        pg.getEmailField().sendKeys("m.rizwan07@gmail.com");
        pg.getPassword().sendKeys("3NpLSVre2Yaw2iw");

        pg.getLoginBtn().click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        File cookies = new File("cookies.txt");
        //write cookies in file
        try
        {
            cookies.delete();
            cookies.createNewFile();

            FileWriter Kim = new FileWriter(cookies);

            BufferedWriter actualWriter = new BufferedWriter(Kim);

            for (Cookie ck: driver.manage().getCookies())
            {
                actualWriter.write((ck.getName()+"^;"+ck.getValue()+"^;"+ck.getDomain()+"^;"+ck.getPath()+"^;"+ck.getExpiry()+"^;"+ ck.isSecure()));
                actualWriter.newLine();

                System.out.println(ck.getName());

            }

            actualWriter.close();
            Kim.close();




        }
        catch(Exception e)
        {e.printStackTrace();}
        finally {
        }


    }

    @Test
    public void BsetCookiesAndOpen()
    {

        driver.get("https://sso.teachable.com/secure/9521/identity/login");
        Set<Cookie> setCookies = driver.manage().getCookies();
        for (Cookie ck:setCookies)
        {
            System.out.println(ck.getName());
        }
        System.out.println("First cookies!");
        try{

            File file = new File("cookies.txt");
            FileReader fileReader = new FileReader(file);
            BufferedReader Buffreader = new BufferedReader(fileReader);
            String strline;
            while((strline=Buffreader.readLine())!=null){
                StringTokenizer token = new StringTokenizer(strline,"^;");
                while(token.hasMoreTokens()){
                    String name = token.nextToken();
                    String value = token.nextToken();
                    String domain = token.nextToken();
                    String path = token.nextToken();
                    Date expiry = null;

                    String val;
                    if(!(val=token.nextToken()).equals("null"))
                    {
                        expiry = new Date(val);
                    }
                    Boolean isSecure = new Boolean(token.nextToken()).
                            booleanValue();
                    Cookie ck = new Cookie(name,value,domain,path,expiry,isSecure);
                    System.out.println(ck);
                    driver.manage().addCookie(ck); // This will add the stored cookie to your current session
                }
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }

        System.out.println("second cookies!");
        Set<Cookie> setCookies2 = driver.manage().getCookies();
        for (Cookie ck:setCookies2)
        {
            System.out.println(ck.getName());
        }



        driver.get("https://sso.teachable.com/secure/9521/identity/login");

        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
