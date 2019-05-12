class Simpul{
	char info;
	Simpul right;
	Simpul left;
	
	Simpul(){
	}
}

class Tree{
	Simpul root;

	Tree(){
	}
	/*--------------------------------------------------------------------------------------*/
	void makeTree(char c){
		Simpul node;
		node = new Simpul();

		node.info = c;
		node.right = null;
		node.left = null;
		root = node;
	}
	/*--------------------------------------------------------------------------------------*/
	void addRight(char c,Simpul root){
		if(root.right == null){
			/*Jika sub pohon kanan kosong*/
			Simpul node;
			node = new Simpul();

			node.info = c;
			node.right = null;
			node.left = null;
			root.right = node;
		}else{
			System.out.println("Sub pohon kanan telah terisi");
		}
	}
	/*--------------------------------------------------------------------------------------*/
	void addLeft(char c,Simpul root){
		if(root.left == null){
			/*Jika sub pohon kiri kosong*/
			Simpul node;
			node = new Simpul();

			node.info = c;
			node.right = null;
			node.left = null;
			root.left = node;
		}else{
			System.out.println("Sub pohon kiri telah terisi");
		}
	}
	/*--------------------------------------------------------------------------------------*/
	void delRight(Simpul root){
		Simpul node = root.right;

		root.right = null;
	}
	/*--------------------------------------------------------------------------------------*/
	void delLeft(Simpul root){
		Simpul node = root.left;

		root.left = null;
	}
	/*--------------------------------------------------------------------------------------*/
	void printTreePreOrder(Simpul root){
		if(root != null){
			System.out.print(" "+root.info+" ");

			printTreePreOrder(root.left);
			printTreePreOrder(root.right);
		}
	}
	/*--------------------------------------------------------------------------------------*/
	void printTreeInOrder(Simpul root){
		if(root != null){
			printTreeInOrder(root.left);
			System.out.print(" "+root.info+" ");
			printTreeInOrder(root.right);
		}
	}
	/*--------------------------------------------------------------------------------------*/
	void printTreePostOrder(Simpul root){
		if(root != null){
			printTreePostOrder(root.left);
			printTreePostOrder(root.right);

			System.out.print(" "+root.info+" ");
		}
	}
	/*--------------------------------------------------------------------------------------*/
	void printTreeLevelOrderNext(Simpul root){
		if(root != null){
			if(root.left != null){
				System.out.print(" "+root.left.info+" ");
			}if(root.right != null){
				System.out.print(" "+root.right.info+" ");
			}if(root.left != null){
				printTreeLevelOrderNext(root.left);
			}if(root.right != null){
				printTreeLevelOrderNext(root.right);
			}
		}
	}
	/*--------------------------------------------------------------------------------------*/
	void printTreeLevelOrder(Simpul root){
		if(root != null){
			System.out.print(" "+root.info+" ");

			printTreeLevelOrderNext(root);
		}
	}
	/*--------------------------------------------------------------------------------------*/
	void copyTree(Simpul root1,Simpul root2){
		if(root1 != null){
			root2 = new Simpul();

			root2.info = root1.info;
			if(root1.left != null){
				copyTree(root1.left,root2.left);
			}if(root1.right != null){
				copyTree(root1.right,root2.right);
			}
		}
	}
	/*--------------------------------------------------------------------------------------*/
	boolean isEqual(Simpul root1,Simpul root2){
		boolean hasil = true;

		if((root1 != null) && (root2 != null)){
			if(root1.info != root2.info){
				hasil = false;
			}else{
				isEqual(root1.left,root2.left);
				isEqual(root1.right,root2.right);
			}
		}else{
			if((root1 != null) || (root2 != null)){
				hasil = false;
			}
		}
		return hasil;
	}
}

public class Main{
	public static void main(String[] args) {
		Tree T = new Tree();

		T.makeTree('A');
		T.addLeft('B',T.root);
		T.addRight('C',T.root);
		T.addLeft('D',T.root.left);
		T.addRight('E',T.root.left);
		T.addRight('F',T.root.right);

		System.out.println("==================");
		System.out.println("PreOrder");
		T.printTreePreOrder(T.root);

		System.out.println("\n==================");
		System.out.println("InOrder");
		T.printTreeInOrder(T.root);

		System.out.println("\n==================");
		System.out.println("PostOrder");
		T.printTreePostOrder(T.root);

		System.out.println("\n==================");
		System.out.println("LevelOrder");
		T.printTreeLevelOrder(T.root);

		System.out.println("\n==================");
		Tree T2 = new Tree();

		T2.copyTree(T.root,T2.root);
		if(T.isEqual(T.root,T2.root) == true){
			System.out.println("Pohon sama");
		}else{
			System.out.println("Pohon tidak sama");
		}

		T.delRight(T.root.left);
		T.delLeft(T.root.left);

		System.out.println("\n==================");
		System.out.println("PreOrder setelah dihapus");

		T.printTreePreOrder(T.root);
		System.out.println("\n==================");
	}
}