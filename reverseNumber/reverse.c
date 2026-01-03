# include <stdio.h>

int main() {

    printf("Enter the number: ");

    while (number > 0) {

        int lastNum = number % 10;

        reverse = reverse * 10 + lastNum;

        number = number / 10;

    }

    printf("The reversed number: %d/n,,", reverse);

}
