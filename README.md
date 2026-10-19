# ScrollView App

An Android application demonstrating scrollable layouts, multi-column UI structures, and interactive UI components in Jetpack and Android views.

## Features

- **Header and Subtitle Section:** Top banner and structured subtitle (`Beatles Anthology Vol. 1`) placed in the left-hand column.
- **Scrollable Content:** A vertical `ScrollView` containing a horizontal `LinearLayout` divided into two columns:
  - **Left Column:** Subtitle and topic headings (width set to 100dp with text wrapping).
  - **Right Column:** Main article text about the Beatles Anthology with HTML-formatted highlights and distinct paragraph spacing.
- **Interactive Button:** A submit comment button anchored at the bottom of the screen that triggers a Toast notification displaying `"Comment submitted!"` upon click.

## Layout Structure

- Root layout: `ConstraintLayout`
- Scrolling container: `ScrollView` (positioned below the header/subtitle and above the submit button)
- Inner container: `LinearLayout` (`orientation="horizontal"`)

## Getting Started

1. Open the project in Android Studio.
2. Sync Gradle dependencies if prompted.
3. Run the app on an Android emulator or physical device.
