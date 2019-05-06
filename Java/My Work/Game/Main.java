import java.util.Scanner;

class Hero{
	String nama;
	int hp;
	int attackPower;
	Hero(String inputNama,int inputHp,int inputAttackPower){
		nama = inputNama;
		hp = inputHp;
		attackPower = inputAttackPower;
	}
	String getNama(){
		return nama;
	}
	int getHp(){
		return hp;
	}
	int getAttackPower(){
		return attackPower;
	}
}

public class Main{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean kondisi = true,kondisi2 = true;
		int hpHero1,hpHero2;
		int i = 1;

		Hero hero1 = new Hero("Angela",60,5);
		System.out.println("Nama hero1 : "+hero1.getNama());
		System.out.println("HP hero1   : "+hero1.getHp());
		System.out.println("Attack Power : "+hero1.getAttackPower());

		System.out.println();
		Hero hero2 = new Hero("Archer",50,2);
		System.out.println("Nama hero2 : "+hero2.getNama());
		System.out.println("HP hero2   : "+hero2.getHp());
		System.out.println("Attack Power : "+hero2.getAttackPower());

		hpHero1 = hero1.getHp();
		hpHero2 = hero2.getHp();
		System.out.println();
		while(kondisi){
			char pilih;
			System.out.print("Terjadi penyerangan : ");
				pilih = input.next().charAt(0);
			if(pilih == 'Y' || pilih == 'y'){
				while(kondisi2){
					hpHero1 -= hero2.getAttackPower();		
					hpHero2 -= hero1.getAttackPower();
					System.out.println("\nPenyerangan ke : "+i);
					System.out.println("Sisa HP Hero1 : "+hpHero1);
					System.out.println("Sisa HP Hero2 : "+hpHero2);
					i += 1;
					if(hpHero2 == 0 || hpHero1 == 0){
						kondisi2 = false;
					}
				}
			}else if(pilih == 'N' || pilih == 'n'){
				kondisi = false;
			}else{
				kondisi = true;
			}
		}	
		System.out.println("Akhir Program!!");
	}
}