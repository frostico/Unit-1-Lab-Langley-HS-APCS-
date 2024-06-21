import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    System.out.println("Enter the number of GPU(s) to trade:");
    Scanner numGPUS = new Scanner(System.in);
    String statement1 = numGPUS.nextLine();

    System.out.println("Enter the number of GPUs to purchase 1 glarb of Qbitium:");
    Scanner glarbQbitium = new Scanner(System.in);
    String statement2 = glarbQbitium.nextLine();

    System.out.println("Enter the number of GPUs to purchase 1 glarb of Nvidiam:");
    Scanner glarbNvidiam = new Scanner(System.in);
    String statement3 = glarbNvidiam.nextLine();

    System.out.println("Enter the first and last name of the trader:");
    Scanner name = new Scanner(System.in);
    String statement4 = name.nextLine();

    int GPUs = Integer.parseInt(statement1);

    int priceQbitium = Integer.parseInt(statement2);

    int priceNvidiam = Integer.parseInt(statement3);

    int priceVegiam = 5;
    int priceCryptodium = 2;

    int qbitium = GPUs / priceQbitium;
    GPUs %= priceQbitium;

    int nvidiam = GPUs / priceNvidiam;
    GPUs %= priceNvidiam;
    int vegiam = GPUs / priceVegiam;
    GPUs %= priceVegiam;

    int cryptodium = GPUs / priceCryptodium;
    GPUs %= priceCryptodium;

    int leftoverGPUs = GPUs;

    System.out.print(statement4 + " has traded ");
    System.out.println(statement1 + " GPU(s) for:");
    System.out.println(" ");
    System.out.print(qbitium + " glarb(s) of Qbitium, ");
    System.out.print(nvidiam + " glarb(s) of Nvidiam, ");
    System.out.print(vegiam + " glarb(s) of Vegiam, ");
    System.out.println(cryptodium + " glarb(s) of Cryptodium.");
    System.out.print(statement4 + " will have " + leftoverGPUs + " GPU(s) leftover.");

  }
}
