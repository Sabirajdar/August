/*	Q1.	Create class name as Book with using data member bid,bname,bprice,fauthor,bpublication using do while and 
		switch case and using set and get.
		
		create array of object of size 10 ,store the Book details in it and perform following operations.
	
	case 1 : Add All Book details.
	case 2 : Display All Book details.
	case 3 : Display Book details whose price range between 100 to 500.
	case 4 : Search Book  details using by:
					case 1 : Book Id
					case 2 : Book name
					case 3 : Book price
					case 4 : Book author.
	case 5 : Update Book details using by:
					case 1 :  Book Id
					case 2 : Book name
					case 3 : Book price
					case 4 : Book publication.	
	case 6 : Delete Book details using by:
					case 1 : Book Id
					case 2 : Book name
					case 3 : Book price
					case 4 : Book publication.
					case 5 : Book author.
	case 7 : Count Book details using by:
					case 1 : Book name
					case 2 : Book price
					case 3 : Book publication.
					case 4 : Book author.
	case 8 : Sort Book Details :
					case 1 : Ascending Order By Id.
					case 2 : Descending Order By Price.
	case 9 : Display Second Highest Book Price Details.
	case 10 : Exit the code.	*/
	
	
	import java.util.*;
	
	class Book{
		private int bid;
		private String bname;
		private int bprice;
		private String bauthor;
		private String bpublication;
		
		public void setBid(int i){
			bid=i;
		}
		public int getBid(){
			return bid;
		}
		public void setBname(String n){
			bname=n;
		}
		public String getBname(){
			return bname;
		}
		public void setBprice(int p){
			bprice=p;
		}
		public int getBprice(){
			return bprice;
		}
		public void setBauthor(String a){
			bauthor=a;
		}
		public String getBauthor(){
			return bauthor;
		}
		public void setBpublication(String bp){
			bpublication=bp;
		}
		public String getBpublication(){
			return bpublication;
		}		
	}
	
	
	class BookFunction{
		  int size;
			Scanner sc=new Scanner(System.in);
			Book bk[];
			void addNewBooks(Book...b){
				bk=b;
				size=bk.length;
			}
         
			void showBook(){
				System.out.println("========== Book details =========");
					for(int i=0;i<size;i++){
						System.out.println(bk[i].getBid()+"\t"+bk[i].getBname()+"\t"+bk[i].getBprice()+"\t"+bk[i].getBauthor()+"\t"+bk[i].getBpublication());
					}
			}
			
			
			void priceRange(){
				for(int i=0;i<size;i++){
					if(bk[i]!=null &&  (bk[i].getBprice()>100 && bk[i].getBprice()<500))
						System.out.println(bk[i].getBid()+"\t"+bk[i].getBname()+"\t"+bk[i].getBprice()+"\t"+bk[i].getBauthor()+bk[i].getBpublication());
				}
			}
			
			
			void searchBook(){
				System.out.println("1.By ID");
				System.out.println("2.By Name");
				System.out.println("3.By Price");
				System.out.println("4.By Author");
				System.out.print("\nSelect option: ");
				int op=sc.nextInt();
				
				
				
				switch(op){
					case 1:	System.out.print("Enter ID to search: ");
							int id=sc.nextInt();
							int ind=0;
							boolean flag=false;
							for(int i=0;i<size;i++){
								if(bk[i].getBid() == id){
									ind=i;
									flag=true;
								}
							}
							
							if(flag){
								System.out.println(bk[ind].getBid()+"\t"+bk[ind].getBname()+"\t"+bk[ind].getBprice()+"\t"+bk[ind].getBauthor()+bk[ind].getBpublication());
							}
							else{
								System.out.println("Book not found !!");
							}
							break;
				
				
					case 2: System.out.print("Enter book name to search: ");
							String bn=sc.next();
							ind=0;
							flag=false;
							for(int i=0;i<size;i++){
								if(bn.equals(bk[i].getBname())){
									ind=i;
									flag=true;
								}
							}
							
							if(flag){
								System.out.println(bk[ind].getBid()+"\t"+bk[ind].getBname()+"\t"+bk[ind].getBprice()+"\t"+bk[ind].getBauthor()+bk[ind].getBpublication());
							}
							else{
								System.out.println("Book not found !!");
							}
							break;
							
					
					case 3: System.out.print("Enter book price to search: ");
							int pr=sc.nextInt();
							ind=0;
							flag=false;
							for(int i=0;i<size;i++){
								if(bk[i].getBprice() == pr){
									ind=i;
									flag=true;
								}
							}
							
							if(flag){
								System.out.println(bk[ind].getBid()+"\t"+bk[ind].getBname()+"\t"+bk[ind].getBprice()+"\t"+bk[ind].getBauthor()+bk[ind].getBpublication());
							}
							else{
								System.out.println("Book not found !!");
							}
							break;
							
					case 4: System.out.print("Enter book author to search: ");
							String at=sc.next();
							ind=0;
							flag=false;
							for(int i=0;i<size;i++){
								if(at.equals(bk[i].getBauthor())){
									ind=i;
									flag=true;
								}
							}
							
							if(flag){
								System.out.println(bk[ind].getBid()+"\t"+bk[ind].getBname()+"\t"+bk[ind].getBprice()+"\t"+bk[ind].getBauthor()+bk[ind].getBpublication());
							}
							else{
								System.out.println("Book not found !!");
							}
							break;
				}
			}
			
			
			void updateBook(){
				System.out.println("1.By ID");
				System.out.println("2.By Name");
				System.out.println("3.By Price");
				System.out.println("4.By Author");
				System.out.print("\nSelect option: ");
				int op=sc.nextInt();
				boolean flag=false;
				int ind=0;
				switch(op){
					case 1: System.out.print("Enter Book ID you want to update: ");
							int id=sc.nextInt();
							for(int i=0;i<size;i++){
								if(bk[i].getBid()==id){
									ind=i;
									flag=true;
								}	
							}
							
							if(flag){
								System.out.print("Enter new Book price: ");
								int newPr=sc.nextInt();
								bk[ind].setBprice(newPr);
								System.out.println("Updated Successfully !!");
							}
							else{
								System.out.println("Book not found !!");
							}
							
							break;
							
					case 2: System.out.print("Enter Book name you want to update: ");
							String nm=sc.next();
							for(int i=0;i<size;i++){
								if(nm.equals(bk[i].getBname())){
									ind=i;
									flag=true;
								}	
							}
							if(flag){
								System.out.print("Enter new Book price: ");
								int newPr=sc.nextInt();
								bk[ind].setBprice(newPr);
								System.out.println("Updated Successfully !!");
							}
							else{
								System.out.println("Book not found !!");
							}
							
							break;
							
					case 3: System.out.print("Enter Book price you want to update: ");
							int bp=sc.nextInt();
							for(int i=0;i<size;i++){
								if(bk[i].getBprice()==bp){
									ind=i;
									flag=true;
								}	
							}	
							if(flag){
								System.out.print("Enter new Book price: ");
								int newPr=sc.nextInt();
								bk[ind].setBprice(newPr);
								System.out.println("Updated Successfully !!");
							}
							else{
								System.out.println("Book not found !!");
							}
	
							break;
							
					case 4: System.out.print("Enter Book author you want to update: ");
							String na=sc.next();
							for(int i=0;i<size;i++){
								if(na.equals(bk[i].getBauthor())){
									ind=i;
									flag=true;
								}	
							}
							if(flag){
								System.out.print("Enter new Book price: ");
								int newPr=sc.nextInt();
								bk[ind].setBprice(newPr);
								System.out.println("Updated Successfully !!");
							}
							else{
								System.out.println("Book not found !!");
							}
							
							break;
				}		
			}	
			
			
			void deleteBook(){
				System.out.println("1.By ID");
				System.out.println("2.By Name");
				System.out.println("3.By Price");
				System.out.println("4.By Author");
				System.out.print("\nSelect option: ");
				int op=sc.nextInt();
				int ind=0;
				boolean flag=false;
				
				switch(op){
					case 1: System.out.print("Enter book ID you want to delete: ");
							int id=sc.nextInt();
							for(int i=0;i<size;i++){
								if(bk[i].getBid()==id){
									for(int j=i;j<size-1;j++){
										bk[j]=bk[j+1];
									}
									size--;
									System.out.println("Book deleted successfully !!");
									flag=true;
									showBook();
								}
							}
							if(!flag)
								System.out.println("Book not found !!");	
							
							break;
							
					case 2: System.out.print("Enter book name you want to delete: ");
							String nm=sc.next();
							for(int i=0;i<size;i++){
								if(nm.equals(bk[i].getBname())){
									for(int j=i;j<size-1;j++){
										bk[j]=bk[j+1];
									}
									size--;
									System.out.println("Book deleted successfully !!");
									flag=true;
									showBook();
								}
							}
							
							if(!flag)
								System.out.println("Book not found !!");
							
							break;
							
					case 3: System.out.print("Enter book price you want to delete: ");
							int pr=sc.nextInt();
							for(int i=0;i<size;i++){
								if(bk[i].getBprice()==pr){
									for(int j=i;j<size-1;j++){
										bk[j]=bk[j+1];
									}
									size--;
									System.out.println("Book deleted successfully !!");
									flag=true;
									showBook();
								}
							}

							if(!flag)
								System.out.println("Book not found !!");
							
							break;
							
					case 4: System.out.print("Enter book author you want to delete: ");
							String ba=sc.next();
							for(int i=0;i<size;i++){
								if(ba.equals(bk[i].getBauthor())){
									for(int j=i;j<size-1;j++){
										bk[j]=bk[j+1];
									}
									size--;
									System.out.println("Book deleted successfully !!");
									flag=true;
									showBook();
								}
							}
							
							if(!flag)
								System.out.println("Book not found !!");
								
							
							break;
				}
			}
			
			
			void countBook(){
				System.out.println("1.By ID");
				System.out.println("2.By Name");
				System.out.println("3.By Price");
				System.out.println("4.By Author");
				System.out.print("\nSelect option: ");
				int op=sc.nextInt();
				int count=0;
				switch(op){
					case 1:	System.out.print("Enter book ID you want to count: ");
							int id=sc.nextInt();
	
							for(int i=0;i<size;i++){
								if(bk[i].getBid()==id){
									count++;		
									System.out.println(bk[i].getBid()+"\t"+bk[i].getBname()+"\t"+bk[i].getBprice()+"\t"+bk[i].getBauthor()+"\t"+bk[i].getBpublication());
								}	
							}
							System.out.print("There are "+count+" books of id "+id);
							
							break;
							

					case 2:	Book sameBook[]=new Book[size];
							for(int i=0;i<size;i++){
								for(int j=i+1;j<size;j++){
									if(bk[i].getBname()==bk[j].getBname()){
										boolean isAlreadyAdd=false;
										for(int k=0;k<count;k++){
											if(sameBook[k].getBname()==bk[k].getBname()){
												isAlreadyAdd=true;
												break;
											}
										}
							
										if(!isAlreadyAdd){
											sameBook[count++]=bk[i];
										}
										sameBook[count++]=bk[j];
									}	
								}
							}
							
							Book bookArr[]=new Book[count];					
							for(int i=0;i<count;i++){
								bookArr[i]=sameBook[i];
							}
							
							for(int i=0;i<count;i++){
								System.out.println(bookArr[i].getBid()+"\t"+bookArr[i].getBname());
							}
							
							break;
							
					case 3: System.out.print("Enter book price you want to count: ");
							int pr=sc.nextInt();
	
							for(int i=0;i<size;i++){
								if(bk[i].getBprice()==pr){
									count++;		
									System.out.println(bk[i].getBid()+"\t"+bk[i].getBname()+"\t"+bk[i].getBprice()+"\t"+bk[i].getBauthor()+"\t"+bk[i].getBpublication());
								}	
							}
							System.out.print("There are "+count+" books of price "+pr);
							
							break;
							
					case 4: System.out.print("Enter book author you want to count: ");
							String au=sc.next();
							
							for(int i=0;i<size;i++){
								if(au.equals(bk[i].getBauthor())){
									count++;		
									System.out.println(bk[i].getBid()+"\t"+bk[i].getBname()+"\t"+bk[i].getBprice()+"\t"+bk[i].getBauthor()+"\t"+bk[i].getBpublication());
								}	
							}
							System.out.print("There are "+count+" books of author "+au);
							
							break;
				}
				
			}
			
					
			void sortBook(){
				System.out.println("1.Sort in Ascending order by ID");
				System.out.println("2.Sort by Descending order");
				System.out.print("\nSelect option: ");
				int op=sc.nextInt();
				
				switch(op){
					case 1:	for(int i=0;i<size;i++){
								for(int j=i+1;j<size;j++){
									if(bk[i].getBid()>bk[j].getBid()){
										Book temp=bk[i];
										bk[i]=bk[j];
										bk[j]=temp;
									}
								}
							}
							System.out.println("After sorting in Ascending order by ID");
							showBook();
							break;
							
					case 2: for(int i=0;i<size;i++){
								for(int j=i+1;j<size;j++){
									if(bk[i].getBprice()<bk[j].getBprice()){
										Book temp=bk[i];
										bk[i]=bk[j];
										bk[j]=temp;
									}
								}
							}
							System.out.println("After sorting in Descending order by Price");
							showBook();
							break;
				}
			}
			
			
			void secHigh(){
				int high=0,secHigh=0;
				for(int i=0;i<size;i++){
					if(bk[i].getBprice() > high){
						secHigh=high;
						high=bk[i].getBprice();
					}
					else if(bk[i].getBprice() > secHigh && bk[i].getBprice() < high){
						secHigh=bk[i].getBprice();
					}
				}
				System.out.print("Second High Book price is "+secHigh);
			}
			
	}
	
	public class BookStore{
		public static void main(String x[]){
			Scanner sc=new Scanner(System.in);
			//boolean f=false;
			Book b[]=new Book[3];
			BookFunction bf=new BookFunction();
			boolean f= true;
			do{
				System.out.println("\n============================================================");
				System.out.println("1.Add all Book details");
				System.out.println("2.Display all Book details");
				System.out.println("3.Display Book details whose price range between 100 to 500");
				System.out.println("4.Search Book  details by using");
				System.out.println("5.Update Book details by using");
				System.out.println("6.Delete Book details by using");
				System.out.println("7.Count Book details by using");
				System.out.println("8.Sort Book Details");
				System.out.println("9.Display Second Highest Book Price Details");
				System.out.println("10.Exit");
				System.out.print("\nEnter choice: ");
				int ch=sc.nextInt();
				
				
				
				switch(ch){
					case 1: for(int i=0;i<b.length;i++){
								b[i]=new Book();
								System.out.print("\n\nEnter Book Id: ");
								int id=sc.nextInt();
								b[i].setBid(id);
								System.out.print("Enter Book name: ");
								String n=sc.next();
								b[i].setBname(n);
								System.out.print("Enter book price: ");
								int pr=sc.nextInt();
								b[i].setBprice(pr);
								System.out.print("Enter author: ");
								String a=sc.next();
								b[i].setBauthor(a);
								System.out.print("Enter publication: ");
								String bp=sc.next();
								b[i].setBpublication(bp);
								
							}
							bf.addNewBooks(b);
							break;
							
					case 2: bf.showBook();
							break;
							
							
					case 3:	bf.priceRange();
							break;
							
					case 4: bf.searchBook();
							break;
							
					case 5: bf.updateBook();
							break;
							
					case 6: bf.deleteBook();
							break;
							
					case 7: bf.countBook();
							break;
					
					case 8: bf.sortBook();
							break;
					
					case 9: bf.secHigh();
							break;
							
					case 10: f=false;
							break;
				}
				
				
			}while(f);
			
		}
	}