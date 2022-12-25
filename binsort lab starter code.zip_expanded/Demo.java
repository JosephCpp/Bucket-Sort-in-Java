
public class Demo {

	public static void main(String[] args) {

		//test data
//		String[] someData = {"neo","alv", "don", "bob", "cam"};		
		//String[] someData = {"neoo","alvv", "dond", "bobb", "camc", "zeoo"};
		//String[] someData = {"alvvz", "bobba", "camct","aondr","aeoor", "zeooz"};
		String[] someData = {"alvvz", "bobba", "camct","aondr","aeoor", "zeooz",
							"alvvz", "bobba", "camct","aondr","aeopr", "zeopz"};
		
		BinSort sortJob = new BinSort(someData);
		
		int numWords = someData.length;
		Stack orig = new Stack();
		for(int i = 0; i < numWords; i++){
			orig.push(someData[i]);
		}
		
		sortJob.sort();	

		//printing signs
		System.out.println("original , sorted");
		for(int i = 0; i < numWords; i++){
			System.out.println(orig.pop()+ " , " + sortJob.getSorted().pop() ); 
		}
	}
}
