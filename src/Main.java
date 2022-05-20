/**
Java unterstützt die Möglichkeit Methoden mit einer variablen Anzahl an Argumenten zu erzeugen.
Man nennt solche Methoden "variadische Methoden", in Java auch "varargs" (für "variable Argumente") 

In der Funktionsdeklaration wird dies mit Auslassungspunkten (...) angezeigt, der sogenannten Ellipse.
**/

class Main {

  /*
    An Stelle der Ellipse ("...") können beliebig viele Argumente (oder auch keine) übergeben werden. 
    Innerhalb der Methode steht die Parameterliste als Array zu Verfügung
  */
  public static void printNamen(String... namen) {
    if (namen.length==0) {
      System.out.println("Keine Namen übergeben.");
    } else {
      for(int i=0; i<namen.length; i++){
        System.out.print(namen[i]+" ");
      }
      System.out.println();
    }

  }

public static double sum(double... numbers) {
  double sum=0.0;
  for(double n: numbers){
    sum +=n;
  }

  return sum;

}

  public static void main(String[] args) {
    
    //variatische Methoden können mit einer beliebigen Anzahl an Argumenten aufgerufen werden.
    printNamen("Hildegard");
    printNamen("Hildegard", "Hermann");
    printNamen("Hildegard", "Hermann", "Hans", "Heidi");
    printNamen();

    System.out.println();
    System.out.println("Summe: "+sum(3.2,4.5));
    System.out.println("Summe: "+sum(1.,1.5,2.,7.8));
     System.out.println("Summe: "+sum());

  }
}