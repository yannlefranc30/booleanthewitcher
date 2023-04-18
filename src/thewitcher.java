public class thewitcher {

    public static void main(String[] args) {

        //declaration de variables
        boolean thewitch1 = true;

        System.out.println( "thewitch1 == " + thewitch1 );

        boolean thewitch2 = false;

        System.out.println( "thewitch2 == " + thewitch2 );


        //opérateur logique avec le et
        if ( thewitch1 && thewitch2 ) {
            System.out.println( "the witcher et ciri" );
        }

        //opérateur logique avec le ou
        if ( thewitch1 || thewitch2 ) {
            System.out.println( " the witcher ou ciri" );
        }

        if ( thewitch1 == false ) {            // if ( state1 == false ) {
            System.out.println( "the witcher ");
        }

        if ( ! thewitch2 ) {           // le Not correspond à un manque de lo {
            System.out.println( "the witcher not ciri");
        }
    }
}
