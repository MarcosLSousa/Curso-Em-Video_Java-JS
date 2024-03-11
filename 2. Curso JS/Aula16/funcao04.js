/*function fatorial(n)
{
let fat = 1
for (let cont = n ; cont > 1 ; cont--)
    {
    fat*=cont
    }
return fat
}

console.log(fatorial(5))*/


// n! = n x (n-1)!
// fatorial de um número pode ser calculado baseado no fatorial de outro
// Fatorial de n = n - 1 (exceto 1)
//
//BASEADO NESSES CONCEITOS,
//RECURSIVIDADE
function fatorial (n)
{
if (n == 1)
    {
    return 1
    }
else
    {
    return n * fatorial(n-1)
    }
}
console.log(fatorial(5))