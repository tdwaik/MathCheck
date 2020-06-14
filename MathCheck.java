/**
 * @author Thaer Aldwaik <tdwaik@hotmail.com>
 * June 14, 2020
 */
public class MathCheck {

    public static void main(String[] args) {

        String bla = "(2*6*8(398/7)-5+(7%5)(5+2*(1+2))+2*(2)+2*2^2((2*2)))";
        String replaceWith = "1"; // use only numbers
        String compare;

        do {
            compare = bla;
            bla = bla.replaceAll("\\((\\d+[\\+\\-\\*\\/\\^\\%])+\\d+\\)|\\(\\d+\\)", replaceWith);
        }while (!compare.equals(bla));

        System.out.println(bla.equals(replaceWith)? "sa7" : "mush sa7");

    }
}
