package com.example.countdown.component

import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextLayoutResult
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp


@Composable
fun CounterText(
    fontSize: TextUnit = 30.sp,
    fontStyle: FontStyle? = null,
    modifier: Modifier = Modifier,
    fontWeight: FontWeight? = FontWeight.Bold,
    text: String,
    letterSpacing: TextUnit = TextUnit.Unspecified,
    textDecoration: TextDecoration? = null,
    color: Color = Color.Unspecified,
    fontFamily: FontFamily? = FontFamily.Monospace,
    textAlign: TextAlign? = null,
    lineHeight: TextUnit = TextUnit.Unspecified,
    overflow: TextOverflow = TextOverflow.Clip,
    softWrap: Boolean = true,
    maxLines: Int = Int.MAX_VALUE,
    onTextLayout: (TextLayoutResult) -> Unit = {},
    style: TextStyle = LocalTextStyle.current,
) {
    Text(
        fontSize = fontSize,
        fontStyle = fontStyle,
        modifier = modifier,
        fontWeight = fontWeight,
        text = text,
        letterSpacing = letterSpacing,
        textDecoration = textDecoration,
        color = color,
        fontFamily = fontFamily,
        textAlign = textAlign,
        lineHeight = lineHeight,
        overflow = overflow,
        softWrap = softWrap,
        maxLines = maxLines,
        onTextLayout = onTextLayout,
        style = style,
    )

}


@Preview
@Composable
private fun CounterTextPreview() {
    CounterText(text = "123")
}