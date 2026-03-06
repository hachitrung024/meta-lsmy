SUMMARY = "TensorFlow Lite check and diagnostic application"
DESCRIPTION = "Simple TensorFlow Lite check utility used to verify TensorFlow Lite availability and functionality on target"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "git://github.com/hachitrung024/IoT-AI-Laboratory-Safety-System-on-CoreIoT-with-Yocto-Linux.git;branch=main;protocol=https"
SRCREV = "${AUTOREV}"

S = "${WORKDIR}/git/src/tflite-check"

inherit cmake pkgconfig

DEPENDS += " \
    opencv \
    libcamera \
    tensorflow-lite \
"

RDEPENDS:${PN} += " \
    opencv \
    libcamera \
    tensorflow-lite \
"

EXTRA_OECMAKE += "-DCMAKE_CXX_STANDARD=17"