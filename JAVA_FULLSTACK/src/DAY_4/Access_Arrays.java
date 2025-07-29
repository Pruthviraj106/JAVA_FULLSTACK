//Accessing and Updating All Array Elements

package DAY_4;

public class Access_Arrays {
	public static void main(String[] args)
    {
    int[]arr;

    arr = new int[5];

  	arr[0] = 2;
	arr[1] = 4;
    arr[2] = 8;
    arr[3] = 12;
    arr[4] = 16;
    

    for (int i = 0; i < arr.length; i++)
        System.out.println("Element at index " + i + " : " + arr[i]);

}

}
