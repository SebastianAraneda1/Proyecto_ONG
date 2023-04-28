function adoptar(){
  const e = window.event;
  const element = document.getElementById(e.target.id);
  if ( element ) {
    const adop = "<label>Adoptado</label>"
    element.innerHTML = adop
    alert("Has adoptado a un cachorro")
  }
  // console.log(5 == '5');
  // console.log( 5 === '5');
}