package Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {

    public Properties p;

   public ReadConfig()
   {
       //to  read a properties file, we need to use FileInputStream and load the  file and then pass that into properties object

       try{
           p = new Properties();
           FileInputStream fis = new FileInputStream("/Users/muhammadrizwan/Configs/config.properties");
           p.load(fis);
       }
       catch(IOException e)
       {
           e.printStackTrace();
       }


   }

    public String getTmUserName()
    {
        String tmUserName = p.getProperty("tmusername");
        return tmUserName;

    }

    public String gettmpassword()
    {
        String tmpassword = p.getProperty("tmpassword");
        return tmpassword;

    }

    public String getPdmusername()
    {
        String pdmusername = p.getProperty("pdmusername");
        return pdmusername;

    }


    public String getPdmpassword()
    {
        String pdmpassword = p.getProperty("pdmpassword");
        return pdmpassword;

    }





}
