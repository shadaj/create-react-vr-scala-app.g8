package hello.world

import slinky.core._
import slinky.core.annotations.react

import slinky.vr._

import scala.scalajs.js

@react class App extends Component {
  type Props = Unit
  type State = Int

  def initialState = 0

  def render() = {
    View(
      style = js.Dynamic.literal(
        width = 4680,
        height = 900,
        alignItems = "center",
        flexDirection = "column"
      )
    )(
      Text(
        style = js.Dynamic.literal(
          backgroundColor = "#777879",
          fontSize = 100,
          paddingLeft = 20,
          paddingRight = 20,
          textAlign = "center",
          textAlignVertical = "center"
        )
      )("Hello Slinky!"),
      Text(
        style = js.Dynamic.literal(
          backgroundColor = "#777879",
          fontSize = 40,
          paddingLeft = 20,
          paddingRight = 20,
          marginTop = 20,
          textAlign = "center",
          textAlignVertical = "center",
          transform = js.Array(
            js.Dynamic.literal(
              translate = js.Array(0, 0, 0)
            )
          )
        )
      )(s"Count: \$state"),
      VrButton(
        onClick = () => {
          setState(state + 1)
        }
      )(
        Text(
          style = js.Dynamic.literal(
            backgroundColor = "#ffffff",
            color = "blue",
            fontSize = 40,
            paddingLeft = 20,
            paddingRight = 20,
            marginTop = 20,
            textAlign = "center",
            textAlignVertical = "center"
          )
        )("Click Me!")
      )
    )
  }
}
