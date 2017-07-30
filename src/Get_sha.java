
import java.security.*;
import java.io.*;public class Get_sha
{
	

		private static final char[] HEX_DIGITS = { '0', '1', '2', '3', '4', '5',
            '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };

    
        /**
         * 十六进制字符串SHA1
         * @param hexData
         * @return
         */
        public  String sha1code(String hexData){
			 byte[]  data = hexStringToByteArray(hexData);
			MessageDigest md = null;
			try {
				md = MessageDigest.getInstance("SHA-1");
			} catch (NoSuchAlgorithmException e) {
				e.printStackTrace();
			}
			md.update(data, 0, data.length);
			byte[] sha1hash = md.digest();
			return getFormattedText(sha1hash);
        }

        /**
         * 把十六进制字符串转换成byte
         * @param s
         * @return
         */
        private  byte[] hexStringToByteArray(String s) {
            int len = s.length();
            byte[] data = new byte[len / 2];
            for (int i = 0; i < len; i += 2) {
                data[i / 2] = (byte) ((Character.digit(s.charAt(i), 16) << 4)
					+ Character.digit(s.charAt(i+1), 16));
            }
            return data;
        }

        /**
         * 把byte转换成string
         * @param bytes
         * @return
         */
        private  String getFormattedText(byte[] bytes) {
			int len = bytes.length;
			StringBuilder buf = new StringBuilder(len * 2);
			for (int j = 0; j < len; j++) {
				buf.append(HEX_DIGITS[(bytes[j] >> 4) & 0x0f]);
				buf.append(HEX_DIGITS[bytes[j] & 0x0f]);
			}
			return buf.toString();
		}
	
	
	
	
	
	
	
	public static String getSha1(String str){
        if(str==null||str.length()==0){
            return null;
        }
        char hexDigits[] = {'0','1','2','3','4','5','6','7','8','9',
			'a','b','c','d','e','f'};
        try {
            MessageDigest mdTemp = MessageDigest.getInstance("SHA1");
            mdTemp.update(str.getBytes("UTF-8"));

            byte[] md = mdTemp.digest();
            int j = md.length;
            char buf[] = new char[j*2];
            int k = 0;
            for (int i = 0; i < j; i++) {
                byte byte0 = md[i];
                buf[k++] = hexDigits[byte0 >>> 4 & 0xf];
                buf[k++] = hexDigits[byte0 & 0xf];      
            }
            return new String(buf);
        } catch (Exception e) {
            // TODO: handle exception
            return null;
        }
    }
	public static String ith(int i){
	return Integer.toHexString(i);
		
		
		
	}
	
	public static String readTxt(String filePath) {
   String a="";
		try {
			File file = new File(filePath);
			if(file.isFile() && file.exists()) {
				InputStreamReader isr = new InputStreamReader(new FileInputStream(file), "utf-8");
				BufferedReader br = new BufferedReader(isr);
				String lineTxt = null;
				while ((lineTxt = br.readLine()) != null) {
					a=a+lineTxt;
				}
				
				br.close();
				return a;
			} else {
				System.out.println("文件不存在!");
			}
		} catch (Exception e) {
			System.out.println("文件读取错误!");
		}
return a;
	}
	
	public static String format(byte []bt){
		int line=0 ;
		StringBuilder buf=new StringBuilder() ;
		for(byte d:bt){
			if(line%16==0)
				//buf.append(String.format("%05x: ", line)) ;
			buf.append(String.format("%02x", d)) ;
			//line++ ;
			//if(line%16==0)
				//buf.append("\n");  
		}
		//buf.append("\n") ;
		return buf.toString();
	}
	public static byte[] readFile(String file) throws IOException{  
		InputStream is=new FileInputStream(file) ;
		int length=is.available() ;
		byte bt[]=new byte[length] ;
		is.read(bt) ; 
		return bt;
	}
	
	
}
