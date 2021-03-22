package edu.iis.mto.similarity;

import static org.junit.jupiter.api.Assertions.*;

import edu.iis.mto.searcher.SequenceSearcher;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.concurrent.ThreadLocalRandom;

class SimilarityFinderTest {

    private final SequenceSearcher sequenceSearcher = null;
    private final SimilarityFinder similarityFinder = new SimilarityFinder(sequenceSearcher);
    private int[] arr1;
    private int[] arr2;

    @BeforeEach
    void initialize() {
        final int MAX_RANGE = 100;
        final int MIN_RANGE = 1;
        arr1 = new int[ThreadLocalRandom.current().nextInt(MIN_RANGE, MAX_RANGE)];
        arr2 = new int[ThreadLocalRandom.current().nextInt(MIN_RANGE, MAX_RANGE)];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = ThreadLocalRandom.current().nextInt(MIN_RANGE, MAX_RANGE);
        }
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = ThreadLocalRandom.current().nextInt(MIN_RANGE, MAX_RANGE);
        }
    }

    @Test
    void resultShouldBeEqualTo1() {
        int[] arr1_1 = {};
        int[] arr2_1 = {};
        double result = similarityFinder.calculateJackardSimilarity(arr1_1, arr2_1);
        assertEquals(1.0d, result);
    }
}
