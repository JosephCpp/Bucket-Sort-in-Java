
public class BinSort {
	private String[] theData;  	// original data
	private Stack[]  bin; 		// array of Stacks, 26;
	private Stack 	 master;  	// sorted data must be stored here
	private Stack 	 unsorted;  // unsorted data can be stored here
	
	private int wordSz;  //number of characters in each string
	private int dataSz;  //number of words in the data set string
	

	public BinSort(String[] inputList) {
		theData = inputList;// inputList.clone();
		bin = new Stack[26];
		for(int i = 0; i < 26; i++) {
			bin[i] = new Stack();
		}
		wordSz   =  inputList[0].length();
		dataSz   =  inputList.length;
		master 	 = new Stack();  //where the sorted data resides
		unsorted = new Stack();  //where the unsorted data resides
		
	}

	public Stack getSorted() {
		return master;
	}

	public void sort() 
	{
		
		int firstCheckIndex = wordSz - 1; //get the charAt value you should check first
		final int AlphaAsciiDiff = 97; //constant for converting between ASCII and the alphabet
		for (String str : theData) //start the sort by putting items from array to master stack	and unsorted stack
		{
			master.push(str);
			unsorted.push(str);
		}
		
		for (int charAtVal = firstCheckIndex; charAtVal >= 0; charAtVal--) //number of "digits", and which value to pass to the charAt method
		{
			for (int i = 0; i < dataSz; i++) //put all words into their respective bins
			{
				String string = master.pop();
				char character = (string).charAt(charAtVal);
				bin[(int)(character) - AlphaAsciiDiff].push(string);
				
			}
			for (int i = 25; i >= 0; i--) //loop through all the bins from right to left
			{
				if (!bin[i].isEmpty()) //loop through the bin/stack and pull all out back to master bin
				{
					while(!bin[i].isEmpty())
					{
						master.push(bin[i].pop());
					}
				}
			}
			
		}
	}

}