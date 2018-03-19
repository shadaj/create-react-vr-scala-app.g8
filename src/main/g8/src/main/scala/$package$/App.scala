package $package$

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
        layoutOrigin = js.Array(0.5, 0.5),
        transform = js.Array(
          js.Dynamic.literal(
            translate = js.Array(0, 0, -6)
          )
        )
      )
    )(
      Pano(source = ReactVR.asset("chess-world.jpg")),
      Text(
        style = js.Dynamic.literal(
          backgroundColor = "#777879",
          fontSize = 0.8,
          paddingLeft = 0.2,
          paddingRight = 0.2,
          textAlign = "center",
          textAlignVertical = "center"
        )
      )("Hello Slinky!"),
      Text(
        style = js.Dynamic.literal(
          backgroundColor = "#777879",
          fontSize = 0.4,
          paddingLeft = 0.2,
          paddingRight = 0.2,
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
            fontSize = 0.4,
            paddingLeft = 0.2,
            paddingRight = 0.2,
            textAlign = "center",
            textAlignVertical = "center",
            transform = js.Array(
              js.Dynamic.literal(
                translate = js.Array(0, 0, 0.5)
              )
            )
          )
        )("Click Me!")
      )
    )
  }
}
