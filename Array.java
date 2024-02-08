class Array{
    public static void main(String[] args){
        int number,Biggest_no,size=10;
        int[] Array={10,20,30,40,78,98,14,100,25,15};
        Biggest_no = Array[0];
        for (number=1;number<size;number++) {
            if (Array[number] > Biggest_no) {
                Biggest_no = Array[number];
            }
        }
            System.out.println("Biggest Number in Given Array:" + Biggest_no);

    }
}






 