package com.jonsuapps.rastro.android.ui.components

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.spring
import androidx.compose.animation.core.Spring
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material.icons.outlined.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jonsuapps.rastro.R
import com.jonsuapps.rastro.navigation.RastroScreen
import com.jonsuapps.rastro.theme.RastroColors
import com.jonsuapps.rastro.theme.RastroShapes

/**
 * Acciones rápidas de la barra superior.
 */
@Composable
fun TopHeaderActions(
    colors: RastroColors,
    userPhotoUrl: String? = null,
    onOpenProfile: () -> Unit,
    onOpenNotifications: () -> Unit,
    unreadNotifications: Int = 0,
    onOpenPomodoro: () -> Unit,
    onOpenFormulas: () -> Unit,
    onOpenThemeSelector: () -> Unit
) {
    Surface(
        color = colors.background,
        modifier = Modifier
            .fillMaxWidth()
            .statusBarsPadding()
    ) {
        val logoDrawableRes by com.jonsuapps.rastro.android.logo.RastroLogoManager.currentDrawableRes.collectAsState()
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 14.dp, vertical = 6.dp),
            horizontalArrangement = Arrangement.spacedBy(4.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = logoDrawableRes),
                contentDescription = "RASTRO",
                modifier = Modifier.weight(1f).height(30.dp),
                contentScale = androidx.compose.ui.layout.ContentScale.Fit,
                alignment = Alignment.CenterStart
            )
            Row(
                horizontalArrangement = Arrangement.spacedBy(4.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                // 1. Notificaciones con Badge Rojo
                Box(modifier = Modifier.size(34.dp), contentAlignment = Alignment.Center) {
                    Box(
                        modifier = Modifier
                            .align(Alignment.Center)
                            .size(30.dp)
                            .clip(RoundedCornerShape(10.dp))
                            .background(colors.surface)
                            .border(1.5.dp, colors.strokeBorder, RoundedCornerShape(10.dp))
                            .bouncyClick(scaleDown = 0.88f, onClick = onOpenNotifications),
                        contentAlignment = Alignment.Center
                    ) {
                        Icon(
                            imageVector = Icons.Outlined.Notifications,
                            contentDescription = "Notificaciones",
                            tint = colors.textPrimary,
                            modifier = Modifier.size(19.dp)
                        )
                    }
                    if (unreadNotifications > 0) {
                        val badgeText = if (unreadNotifications > 99) "99+" else unreadNotifications.toString()
                        Box(
                            modifier = Modifier
                                .align(Alignment.TopEnd)
                                .offset(x = (-1).dp, y = 1.dp)
                                .widthIn(min = 18.dp)
                                .height(18.dp)
                                .clip(CircleShape)
                                .background(Color(0xFFE53935))
                                .border(1.5.dp, colors.background, CircleShape)
                                .padding(horizontal = 3.dp),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                text = badgeText,
                                color = Color.White,
                                fontSize = if (badgeText.length > 2) 8.sp else 9.sp,
                                lineHeight = 10.sp,
                                fontWeight = androidx.compose.ui.text.font.FontWeight.Black,
                                maxLines = 1
                            )
                        }
                    }
                }

                // 2. Pomodoro Clock
                SquareHeaderButton(
                    icon = Icons.Outlined.Schedule,
                    colors = colors,
                    onClick = onOpenPomodoro
                )

                // 3. Calculadora / Fórmulas
                SquareHeaderButton(
                    icon = Icons.Outlined.Calculate,
                    colors = colors,
                    onClick = onOpenFormulas
                )

                // 4. Selector de Temas
                SquareHeaderButton(
                    icon = Icons.Outlined.Palette,
                    colors = colors,
                    onClick = onOpenThemeSelector
                )

                // 5. Foto / Avatar del usuario AL EXTREMO DERECHO
                Box(
                    modifier = Modifier
                        .size(32.dp)
                        .bouncyClick(scaleDown = 0.88f, onClick = onOpenProfile),
                    contentAlignment = Alignment.Center
                ) {
                    CartoonAvatar(
                        photoUrl = userPhotoUrl,
                        size = 30.dp,
                        strokeColor = colors.strokeBorder,
                        strokeWidth = 1.5.dp,
                        bevelColor = colors.cardBevel,
                        bevelOffset = 1.5.dp,
                        contentDescription = "Mi Perfil"
                    )
                }
            }
        }
    }
}

@Composable
private fun SquareHeaderButton(
    icon: ImageVector,
    colors: RastroColors,
    onClick: () -> Unit
) {
    Box(
        modifier = Modifier
            .size(30.dp)
            .clip(RoundedCornerShape(10.dp))
            .background(colors.surface)
            .border(1.5.dp, colors.strokeBorder, RoundedCornerShape(10.dp))
            .bouncyClick(scaleDown = 0.88f, onClick = onClick),
        contentAlignment = Alignment.Center
    ) {
        Icon(
            imageVector = icon,
            contentDescription = null,
            tint = colors.textPrimary,
            modifier = Modifier.size(17.dp)
        )
    }
}

/**
 * LiquidNavbar: Barra inferior flotante estilo Cartoon / Sticker 3D con los 7 destinos exactos.
 * Cuenta con dock con bisel 3D físico, iconos vectoriales cartoon SVG con estados Outline y Filled,
 * y keycaps táctiles activos con pop elástico de resorte.
 */
@Composable
fun LiquidNavbar(
    currentRoute: String,
    colors: RastroColors,
    onNavigate: (RastroScreen) -> Unit,
    onMoreClick: () -> Unit = { onNavigate(RastroScreen.Legal) }
) {
    val navItems = listOf(
        CartoonNavItem(
            screen = RastroScreen.Home,
            label = "Inicio",
            filledResId = R.drawable.ic_nav_home_filled,
            outlineResId = R.drawable.ic_nav_home_outline,
            activeColor = colors.accent
        ),
        CartoonNavItem(
            screen = RastroScreen.Aprender,
            label = "Aprender",
            filledResId = R.drawable.ic_nav_learn_filled,
            outlineResId = R.drawable.ic_nav_learn_outline,
            activeColor = Color(0xFFF97316) // Llama naranja lúdica
        ),
        CartoonNavItem(
            screen = RastroScreen.Cursos,
            label = "Cursos",
            filledResId = R.drawable.ic_nav_courses_filled,
            outlineResId = R.drawable.ic_nav_courses_outline,
            activeColor = Color(0xFF10B981) // Verde esmeralda de estudio
        ),
        CartoonNavItem(
            screen = RastroScreen.Simulador,
            label = "Ranking",
            filledResId = R.drawable.ic_nav_ranking_filled,
            outlineResId = R.drawable.ic_nav_ranking_outline,
            activeColor = Color(0xFFF59E0B) // Oro trofeo victoria
        ),
        CartoonNavItem(
            screen = RastroScreen.Biblioteca,
            label = "Biblioteca",
            filledResId = R.drawable.ic_nav_library_filled,
            outlineResId = R.drawable.ic_nav_library_outline,
            activeColor = Color(0xFF8B5CF6) // Púrpura libros y recursos
        ),
        CartoonNavItem(
            screen = RastroScreen.Perfil,
            label = "Perfil",
            filledResId = R.drawable.ic_nav_profile_filled,
            outlineResId = R.drawable.ic_nav_profile_outline,
            activeColor = colors.accent
        ),
        CartoonNavItem(
            screen = RastroScreen.Legal,
            label = "Más",
            filledResId = R.drawable.ic_nav_more_filled,
            outlineResId = R.drawable.ic_nav_more_outline,
            activeColor = colors.textPrimary,
            hasRedBadge = true
        )
    )

    val dockShape = RoundedCornerShape(26.dp)
    val context = LocalContext.current

    Surface(
        color = Color.Transparent,
        modifier = Modifier
            .fillMaxWidth()
            .navigationBarsPadding()
            .padding(horizontal = 10.dp, vertical = 5.dp)
    ) {
        Box(
            modifier = Modifier.fillMaxWidth()
        ) {
            // 1. Bisel 3D Sólido inferior (Estilo Sticker 3D de la app)
            Box(
                modifier = Modifier
                    .matchParentSize()
                    .offset(y = 3.5.dp)
                    .clip(dockShape)
                    .background(colors.cardBevel)
            )

            // 2. Cara frontal del Dock con borde de trazo grueso
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(dockShape)
                    .background(colors.surface)
                    .border(1.8.dp, colors.strokeBorder, dockShape)
                    .padding(vertical = 4.dp, horizontal = 3.dp)
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    navItems.forEach { item ->
                        val isSelected = currentRoute == item.screen.route || 
                                (item.screen == RastroScreen.Aprender && currentRoute.startsWith("aprender")) ||
                                (item.screen == RastroScreen.Cursos && currentRoute.startsWith("cursos")) ||
                                (item.screen == RastroScreen.Perfil && (currentRoute == "perfil" || currentRoute.startsWith("usuario")))

                        val activeColor = item.activeColor ?: colors.accent

                        // Color y fondo suaves sin bordes que deformen o alteren el tamaño del contenedor
                        val itemBgTint by animateColorAsState(
                            targetValue = if (isSelected) activeColor.copy(alpha = 0.12f) else Color.Transparent,
                            animationSpec = androidx.compose.animation.core.tween(durationMillis = 100),
                            label = "navItemBgTint"
                        )
                        val itemContentColor by animateColorAsState(
                            targetValue = if (isSelected) activeColor else colors.textSecondary,
                            animationSpec = androidx.compose.animation.core.tween(durationMillis = 100),
                            label = "navItemContent"
                        )

                        // Micro-escala ágil y contenida con resorte para respuesta inmediata
                        val iconScale by animateFloatAsState(
                            targetValue = if (isSelected) 1.12f else 1.0f,
                            animationSpec = spring(
                                dampingRatio = 0.65f,
                                stiffness = 650f
                            ),
                            label = "navIconScale"
                        )

                        val keycapShape = RoundedCornerShape(14.dp)

                        Box(
                            modifier = Modifier
                                .weight(1f)
                                .height(46.dp) // Altura estrictamente fija para cero deformaciones
                                .clip(keycapShape)
                                .background(itemBgTint)
                                .clickable(
                                    interactionSource = remember { androidx.compose.foundation.interaction.MutableInteractionSource() },
                                    indication = null // Cero distorsión del contenedor al tocar
                                ) {
                                    DuolingoHaptics.playOptionSelected(context)
                                    if (item.screen == RastroScreen.Legal) onMoreClick() else onNavigate(item.screen)
                                },
                            contentAlignment = Alignment.Center
                        ) {
                            Box(
                                contentAlignment = Alignment.Center
                            ) {
                                Icon(
                                    painter = painterResource(id = if (isSelected) item.filledResId else item.outlineResId),
                                    contentDescription = item.label,
                                    tint = itemContentColor,
                                    modifier = Modifier
                                        .size(25.dp)
                                        .graphicsLayer {
                                            scaleX = iconScale
                                            scaleY = iconScale
                                        }
                                )
                                if (item.hasRedBadge) {
                                    Box(
                                        modifier = Modifier
                                            .align(Alignment.TopEnd)
                                            .offset(x = 6.dp, y = (-2).dp)
                                    ) {
                                        CartoonNavBadge(colors = colors)
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

@Composable
private fun CartoonNavBadge(colors: RastroColors) {
    val badgePulse by rememberBreathingPulse(minScale = 0.85f, maxScale = 1.20f, durationMillis = 1100)
    Box(
        modifier = Modifier
            .size(7.5.dp)
            .graphicsLayer {
                scaleX = badgePulse
                scaleY = badgePulse
            }
            .clip(CircleShape)
            .background(Color(0xFFEF4444))
            .border(1.2.dp, colors.surface, CircleShape)
    )
}

private data class CartoonNavItem(
    val screen: RastroScreen,
    val label: String,
    val filledResId: Int,
    val outlineResId: Int,
    val activeColor: Color? = null,
    val hasRedBadge: Boolean = false
)

