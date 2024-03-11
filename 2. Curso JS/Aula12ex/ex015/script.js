function verificar()
{
    var data = new Date()
    var ano = data.getFullYear()
    var form_ano = document.getElementById('txtano')
    var res = document.querySelector('div#res')
    if (form_ano.value.length == 0 || Number(form_ano.value) > ano)
    {
        alert('[Erro] Verifique os dados e tente novamente!')
    }
    else
    {
        var form_sex = document.getElementsByName('radsex')
        var idade = ano - Number(form_ano.value)
        var genero = ''
        var img = document.createElement('img') //forma de inserir foto via JS (ja vimos por HTML ex ant)
        img.setAttribute('id','foto') //o mesmo que <img id='foto'> por HTML
        if (form_sex[0].checked)
        {
            genero = 'Homem'
            if (idade >= 0 && idade <10)
            {
                img.setAttribute('src','foto-bebe-m.png')
            }
            else if (idade < 21)
            {
                img.setAttribute('src', 'foto-jovem-m.png')
            }
            else if (idade < 50)
            {
                img.setAttribute('src','foto-adulto-m.png')
            }
            else
            {
                img.setAttribute('src','foto-idoso-m.png')
            }
        }
        else if (form_sex[1].checked)
        {
            genero = 'Mulher'
            if (idade >= 0 && idade <10)
            {
                img.setAttribute('src','foto-bebe-f.png')
            }
            else if (idade < 21)
            {
                img.setAttribute('src','foto-jovem-f.png')
            }
            else if (idade < 50)
            {
                img.setAttribute('src','foto-adulto-f.png')
            }
            else
            {
                img.setAttribute('src','foto-idoso-f.png')
            }
        }
        res.style.textAlign = 'center' //forma de centralizar o texto po JS (ja vimos por HTML ex ant.)
        res.innerHTML = `Detectamos ${genero} com ${idade} anos.`
        res.appendChild(img)
    }
}