let num = [4,3,5,6] //1) se quisermos adic. um núm. na últ. pos. de um vetor usamos o 
                  //comando num.push(num desejado)
                  //2) num.length para sabermos o comprimento (NÃO utiliza parênteses, ao contrário de
                  // outras linguagens. Não é um método e sim um atributo)
                  //3) num.sort() coloca os elementos em ordem crescente
                  //4)num.indexOf(valor a pesquisar). O é maiúsculo. Se não existir, JS retorna -1

num.sort()
num.push(1)
console.log(num)
console.log(`O vetor tem ${num.length} posições`)
console.log(`O primeiro valor do vetor é ${num[0]}`)

let pos = num.indexOf(8)
if (pos == -1)
    {
    console.log('O valor não foi encontrado!')
    }
else
    {
    console.log(`O valor está na posição ${pos}`)
    }