class Television {   
private int volume;   
public void setVolume(int volume) {   
if (volume >= 0 && volume <= 100) {   
this.volume = volume;   
} else {   
System.out.println("Invalid volume Set between 0-100.");   
}   
}   
public int getVolume() {   
return volume;   
}   
}   
public class Main14a {   
public static void main(String[] args) {   
Television tv = new Television();   
tv.setVolume(30);   
System.out.println("Current Volume: "+ tv.getVolume());   
}   
}   
Output: