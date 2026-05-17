#include "grains.h"

uint64_t square(uint8_t index)
{
    if (index == 0) {
        return 0;
    }
    
    if (index == 1) {
        return 1;
    }
    return 2 * square(index - 1);
}

uint64_t total(void)
{
    uint64_t result = 0;
    for (int i = 0; i <= 64; i++) {
        result += square(i);
    }
    return result;
}
