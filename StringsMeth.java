//StringBuilder is a mutable class in java. It means we can change the value of the string without creating a new object. StringBuilder is not thread-safe, so it is faster than StringBuffer. StringBuilder is used when we have to make a lot of modifications to strings of characters.
public class StringsMeth {
    public static void main(String args[]) {
        //Declaration
StringBuilder sb = new StringBuilder("Apna College");
     System.out.println(sb);
    // Get A Character from Index
     //Set Char
     System.out.println(sb.charAt(0));

    // Set a Character at Index
     //Get Char
     sb.setCharAt(0, 'P');
     System.out.println(sb);

      //Insert char
     sb.insert(0, 'S');
     System.out.println(sb);


	//delete char
     sb.delete(0, 1);
     System.out.println(sb);

   //Append means to add something at the end.
      sb.append(" Stark");
     System.out.println(sb); 

//Print Length of String
 System.out.println(sb.length());

    }
       }
