#include "difference_of_squares.h"

unsigned int sum_of_squares(unsigned int number) {
    int result = 0;
    for (unsigned int i = 1; i <= number; i++) {
        result += i * i;
    }
    return result;
}

unsigned int square_of_sum(unsigned int number) {
    int result = 0;
    for (unsigned int i = 1; i <= number; i++) {
        result += i;
    }
    return result * result;
}

unsigned int difference_of_squares(unsigned int number) {
    int sum_of_s, square_of_s;
    sum_of_s = sum_of_squares(number);
    square_of_s = square_of_sum(number);
    if (sum_of_s > square_of_s) {
        return sum_of_s - square_of_s;
    } else {
        return square_of_s - sum_of_s;
    }
}