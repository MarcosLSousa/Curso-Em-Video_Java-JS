function soma(n1=0, n2=0) //setamos inicialmente 0 como parâmetros opcionais
                          // pra caso nao ser setado na chamada e aí vai
                          // acabar dando resultado NaN pq um deles ficou undefined
{
return n1 + n2
}

console.log(soma(2,5))