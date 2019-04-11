//ED192
public int count(T value){
	int counter = 0;
	Node <T> curr = first;
	while(curr != null){
		if(curr.getValue().equals(value)){
			counter++;
		}
		curr = curr.getNext();
	}
	return counter;
}
