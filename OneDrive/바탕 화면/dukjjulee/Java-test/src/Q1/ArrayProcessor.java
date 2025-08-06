package Q1;

public class ArrayProcessor {

    public int sumEvenNumbers(int[] numbers) {
        // TODO: 이 메서드를 완성하세요.
        int sum = 0; // 1. 합계를 저장할 변수를 선언하세요.
        for(int i = 0; i < numbers.length; i++){ // 2. 반복문을 사용해 배열의 모든 요소를 확인하세요.
            if (numbers[i] % 2 == 0) { // 3. 현재 요소가 짝수인지 확인하는 조건문을 작성하세요.
               sum = sum + numbers[i];// 4. 짝수라면 합계 변수에 더하세요.
            }
        }
        return sum; // 5. 반복문이 끝나면 최종 합계를 반환하세요.
    }
    public static void main(String[] args) {
        ArrayProcessor processor = new ArrayProcessor();
        int[] numbers = {10, 3, 22, 5, 17, 8};
        int result = processor.sumEvenNumbers(numbers);
        System.out.println("짝수들의 합: " + result); // 예상 결과: 40
    }
}