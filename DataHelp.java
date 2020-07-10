package Samuel;
import java.util.List;
import java.util.ArrayList;
public interface DataHelp {
	default List<String[]> getData(){
		List<String[]> dataList= new ArrayList<String[]>();
		String[] row1= new String[] {"1", "Cindy", "20"};
		String[] row2= new String[] {"2", "Sam", "22"};
		String[] row3= new String[] {"3", "Tom", "23"};
		dataList.add(row1);
		dataList.add(row2);
		dataList.add(row3);
		return dataList;
		
	}

}
