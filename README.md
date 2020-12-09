# UseFullLibrary
**Desc:**

The library contains a collection of Kotlin extensions that are often repeated in projects.

**Current version: 1.0.0**

**How to add:**

**Step 1.** Add the JitPack repository to your build file

		repositories {
			...
			maven { url 'https://jitpack.io' }
	}


**Step 2.** Add the dependency

	        implementation 'com.github.bialasn:UseFullLibrary:1.0.0'


**What we have now.** 
>IntExtension:

.dp
.px

>AnyExtension:

.isNull


>ValidationExtension

.isEmailValid

>ContextExtension

.showToast()

>KeyboardExtension

.showKeyboard
.hideKeyboard

>StringExtension

.containsLatinLetter
.containsDigit
.isAlphanumeric
.isIntegerNumber
.toDecimalNumber

>VisibilityExtension

.show
.hideGone
.hideInvisible
.changeVisibility
