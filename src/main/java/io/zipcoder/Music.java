package io.zipcoder;

public class Music {

    private String[] playList;

    public Music(String[] playList){
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection){
        int up,down;
        up = pressUp(startIndex,selection);
        down = pressDown(startIndex,selection);
        if(up < down) return up;
        return down;
    }

    public int pressUp(Integer startIndex, String selection){
        //minus
        int numClicks = 0, currentIndex = startIndex;
        while(!(playList[currentIndex].equals(selection))){
            numClicks++;
            if(currentIndex-1<0)
                currentIndex = playList.length;
            currentIndex--;
        }
        return numClicks;
    }

    public int pressDown(Integer startIndex,String selection){
        //plus
        int numClicks = 0, currentIndex = startIndex;
        while(!(playList[currentIndex].equals(selection))){
            numClicks++;
            if(currentIndex+1> playList.length-1)
                currentIndex = -1;
            currentIndex++;
        }
        return numClicks;
    }
}
