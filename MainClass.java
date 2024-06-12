/**
 * <p>Title: MainClass</p>
 * <p>Description:</p>
 * @author Bradley Gude
 * @version 1.0
 */

package com.telepacific.merrt.config;

public class MainClass {
    public static void main(String[] args) {
        try {
            String num = "1234567890";
            System.out.println(num.substring(0, 3) + "555" + num.substring(6, 10));
//Runtime rt = Runtime.getRuntime();
//FileCompressor.GUnZipFile(new File("d:\\UBRSFT090409025478.gz"), true);
/*            System.out.println("hi");
            Process pr = rt.exec("c:\\windows\\notepad.exe");
            while (true) {
                try {
                    if (pr.exitValue()==0) {
                        break;
                    }
                    Thread.sleep(100);
                } catch (Exception e) {

                }
            }
            System.out.println("bye");
*/
/*            Connection conn = DriverManager.getConnection("jdbc:sqlserver://10.60.3.56;DatabaseName=usagesearch;SelectMethod=cursor;user=ucore;password=ucore;");
            StringBuffer select = new StringBuffer();
            Statement stmt = conn.createStatement();
            stmt = conn.createStatement();
            stmt.executeUpdate("CREATE DATABASE UCORE");
*/
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
