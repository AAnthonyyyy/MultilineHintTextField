package com.hgm.custommultilinehinttextfield

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.hgm.custommultilinehinttextfield.ui.theme.CustomMultilineHintTextFieldTheme

/**
 *    构建多行提示的文本字段
 *    视频：https://www.youtube.com/watch?v=pGeaLBGFoec
 **/
class MainActivity : ComponentActivity() {
      override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContent {
                  CustomMultilineHintTextFieldTheme {
                        var text by remember {
                              mutableStateOf("")
                        }

                        Column(
                              modifier = Modifier
                                    .fillMaxSize()
                                    .padding(12.dp)
                        ) {
                              MultilineHintTextField(
                                    value = text,
                                    hintText = "Hello\nWelcome to the android\nLearning jetpack compose...",
                                    onValueChange = { text = it },
                                    modifier = Modifier
                                          .fillMaxWidth()
                                          .clip(RoundedCornerShape(8.dp))
                                          .background(Color.LightGray)
                                          .padding(16.dp),
                                    maxLines = 6
                              )
                        }
                  }
            }
      }
}
