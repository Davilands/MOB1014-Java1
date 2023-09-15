package dangthpc04349_lab08;

/**
 *
 * @author dangthpc04349
 */
public class Dangthpc04349_Lab08 {
    public static double sum(double ...nums){
        double s=0;
        for(double num:nums){
            s+=num;
        }
        return s;
    }
    public static double min(double ...nums){
        double min=nums[0];
        for(double num:nums){
            min=Math.min(min,num);
        }
        return min;
    }
    public static double max(double ...nums){
        double max=nums[0];
        for(double num:nums){
            max=Math.max(max, num);
        }
        return max;
    }
    public static String toUpperFirstName(String name){
        String[] m=name.split(" ");
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<m.length;i++){
            String item =m[i];
            if(!item.equals("")){
                String c=item.substring(0,1).toUpperCase();
                item=c+item.substring(1);
                sb.append(item).append(" ");
            }
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        double nums=sum(2,3,5);
        double min=min(2,4,6,9,8);
        double max=max(2,4,6,9,8);
        String name="nguyen      van a";
        String fullName =toUpperFirstName("nguyen van a");
        System.out.println("Sum: "+nums);
        System.out.println("Min: "+min);
        System.out.println("Max: "+max);
        System.out.println("Full name: "+fullName);
        
         fullName =toUpperFirstName(name);
        System.out.println("Delete space: "+fullName);
    }
    
}
