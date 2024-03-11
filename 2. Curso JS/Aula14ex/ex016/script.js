function contar()
{
let tini = document.getElementById('txtini') //variável let nao vai exitir fora do bloco (escopo)
let tfim = document.getElementById('txtfim')
let tpasso = document.getElementById('txtpasso')
let res = document.getElementById('res')
    
if (tini.value.length == 0 || tfim.value.length == 0 || tpasso.value.length == 0)
    {
    res.innerHTML='Impossível contar'
    //alert('[ERRO] Faltam dados!') -> deu erro de içamento quando ele inverteu essa linha com a anterior
    }
    else
        {   
        res.innerHTML = 'Contando: <br>'
        let ini = Number(tini.value)
        let fim = Number(tfim.value)
        let passo = Number(tpasso.value)
        if (passo <= 0)
            {
            res.innerHTML='Passo inválido!'
            }
            else
            {
            if(ini < fim)
            {
            for (let cont = ini; cont <= fim ; cont += passo)
            {
                res.innerHTML += `${cont} \u{1F449}` //unicode emoji list para achar o código do emoji
                                            //retirar o u+ e inserir \u{código emoji list} para JS
                                            //SÓ FUNCIONA ENTRE CRASES ``
                }
            }
            else
                {
                for (let cont = ini; cont >= fim ; cont -= passo)
                    {
                        res.innerHTML += `${cont} \u{1F449}`
                    }
                }
            res.innerHTML += `\u{1F3C1}`
            }
        
        }  
}
