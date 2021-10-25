package com.fastcampus.javaoop.service;

import com.fastcampus.javaoop.logic.BubbleSort;
import com.fastcampus.javaoop.logic.JavaSort;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SortServiceTest {

    // 어떤 구현체를 테스트해야할지 알고 있으므로 new를 쓴다.
    private SortService sut = new SortService(new BubbleSort<String>());

    @Test
    void doSort() {
        // Given
        
        // When
        List<String> actual = sut.doSort(List.of("3", "2", "1"));

        // Then
        assertEquals(List.of("1", "2", "3"), actual);
    }
}