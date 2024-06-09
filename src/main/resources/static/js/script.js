console.log("script loaded..");

let currentTheme = getTheme();
document.addEventListener("DOMContentLoaded",()=>{changeTheme();});


function changeTheme() {
  //set to web page as list
  document.querySelector("html").classList.add(currentTheme);

  //change theme using button click
  let themebutton = document.querySelector("#theme_change_button");
  themebutton.addEventListener("click", () => {
    const oldTheme = currentTheme;
    if (currentTheme === "dark") {
      currentTheme = "light";
    } else {
      currentTheme = "dark";
    }
    //set current in local storage
    setTheme(currentTheme);
    //remove old theme
    document.querySelector("html").classList.remove(oldTheme);
    //add current theme
    document.querySelector("html").classList.add(currentTheme);
    themebutton.querySelector("span").textContent =
      currentTheme == "light" ? "Dark" : "light";
  });
}

//store theme to local storage
function setTheme(theme) {
  localStorage.setItem("theme", theme);
}

//get theme from storage if not defined get default value
function getTheme() {
  let theme = localStorage.getItem("theme");
  return theme ? theme : "light";
}
