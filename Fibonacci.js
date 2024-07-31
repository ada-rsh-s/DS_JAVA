"use strict";
const number = 7;
const fibonacci = (number) => {
    let first = 0, second = 1, fibo = "", result;
    fibo += `0 1 `; 
    
  for (let i = 0; i < number-2; i++) {
    result = first + second;
    fibo += `${result} `;

    first = second;
    second = result;
  
  }   
    console.log(fibo);
};
fibonacci(number);
