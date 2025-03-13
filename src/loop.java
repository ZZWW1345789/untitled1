public class loop {
    public static void main(String[] args)
    {

        int[][] votesTable =
                {
                        {12,13,14,10,15,16},
                        {5,2,6,8,4,3},
                        {13,15,10,12,11,17}
                };

        for(int[] vote : votesTable)
        {
            System.out.println(vote);
            for(int num : vote)
            {
                System.out.println(num);
            }
        }

    }
}
