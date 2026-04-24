SUMMARY = "NNStreamer custom filter: fatigue_eval"
DESCRIPTION = "Custom tensor_filter for Fatigue Evaluation"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "git://github.com/nguyenthinhthanh/IoT-AI-Laboratory-Safety-System-on-CoreIoT-with-Yocto-Linux.git;branch=main;protocol=https"
SRCREV = "${AUTOREV}"

S = "${WORKDIR}/git/ai/nnstreamer-fatigue-eval"

DEPENDS += "nnstreamer glib-2.0"
inherit pkgconfig

do_compile() {
    GLIB_FLAGS=`pkg-config --cflags --libs glib-2.0`
    NNS_FLAGS=`pkg-config --cflags --libs nnstreamer`
    ${CC} ${CFLAGS} ${LDFLAGS} -fPIC -shared fatigue_eval.c \
        -o libnnstreamer_filter_fatigue_eval.so \
        $GLIB_FLAGS $NNS_FLAGS
}

do_install() {
    install -d ${D}/usr/lib/nnstreamer/filters
    install -m 0755 libnnstreamer_filter_fatigue_eval.so \
        ${D}/usr/lib/nnstreamer/filters/
}

FILES:${PN} += "/usr/lib/nnstreamer/filters/libnnstreamer_filter_fatigue_eval.so"
