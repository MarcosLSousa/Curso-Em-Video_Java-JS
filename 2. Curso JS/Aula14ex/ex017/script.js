function tabuada()
    {
    let num = document.getElementById('txtn')
    let tab = document.getElementById('seltab')
    if (num.value.length == 0)
        {
        alert('Por favor, digite um número!')    
        }
        else
            {
            let n = Number(num.value)
            tab.innerHTML = ''
            for (let i = 1 ; i <= 10 ; i++)
                {
                let item = document.createElement('option') //corresponde ao comando "<option></option> em HTML""
                item.text = `${n} x ${i} = ${n*i}`
                item.value = `tab${i}` //linha desnecessária para o programa funcionas, mas necessária para uso do PHP saber o item selecionado
                tab.appendChild(item)
                }

            }
    



    }