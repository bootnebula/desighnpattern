package com.desighnpattern.behavioural.stratergypattern;

public class SortingContext {


    public SortingStratery sortingStratery;

    public SortingContext(SortingStratery sortingStratery) {
        this.sortingStratery=sortingStratery;
    }

    public void performSort(int[] arr){
        sortingStratery.sort(arr);
    }

    public void setSortingStrategy(SortingStratery sortingStratery) {
        this.sortingStratery=sortingStratery;
    }
}
