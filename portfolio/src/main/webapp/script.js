// Copyright 2020 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     https://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

/**
 * Adds a random greeting to the page.
 */
function addRandomFact() {
  const facts =
      ['I have a dog named Coco, she is a brown lab', 'My favourite food is probably sushi',
       'I have nearly 3 whole sketchbooks filled with drawings', "I've actually never seen snow in real life",
      'I have a near perfect memory for useless facts'];

  // Pick a random greeting.
  const fact = facts[Math.floor(Math.random() * facts.length)];

  // Add it to the page.
  const factContainer = document.getElementById('fact-container');
  factContainer.innerText = fact;
}
//Changes tabs
function change_tabs(Name){
  window.location.href = Name + ".html";
}
//Async function to send message
async function send_message(){
    const responseFromServer = await fetch('/information');
    const info = await responseFromServer.json();

    const textContainer = document.getElementById('text-container');
    textContainer.innerText= "";
    textContainer.appendChild(createListElement("Currently: "+ info.currentInfo));
    textContainer.appendChild(createListElement("Recently: "+ info.pastInfo));
    textContainer.appendChild(createListElement("Future Plans: "+ info.futureInfo));
}
/** Creates an <li> element containing text. */
function createListElement(text) {
    const listElement = document.createElement('li');
    listElement.innerText = text;
    return listElement;
  }
