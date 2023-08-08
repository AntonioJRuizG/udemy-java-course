public class Main {
    public static void main(String[] args) {
        
        int edades[] = new int[3];
        edades[0]= 14;
        System.out.println("edades[0] = " + edades[0]);

        for (int i = 0; i< edades.length; i++){
            System.out.println("edad " + i + ": "+ edades[i]);
        }

    }
}