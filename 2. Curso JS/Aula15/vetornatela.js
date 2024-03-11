let valores = [8,1,7,4,2,9]
/*1) console.log(valores)

2)console.log(valores[0])
console.log(valores[1])
console.log(valores[2])
console.log(valores[3])
console.log(valores[4])
console.log(valores[5])

3)cod abaixo é o tradicional (chamado percurso pra exibição no vetor)
for (let pos=0 ; pos < valores.length ; pos++)
    {
    console.log(`A posição ${pos} tem o valor ${valores[pos]}`)
    }
*/
//JS, a partir das versões mais recentes do ECMA Script, forneceu um
//jeito mais simples abaixo
for(let pos in valores) // lê-se para(for) cada posição(pos) dentro(in) de valores(variável composta)
                    //para cada posição dentro de valores
                    //ESSA SINTAXE DO FOR SÓ FUNCIONA PARA ARRAYS OU OBJETOS (QUE NA VERDADE EM JS, TODO 
                    //ARRAY É UM OBJETO)
    {
        console.log(`A posição ${pos} tem o valor ${valores[pos]}`)
    }


