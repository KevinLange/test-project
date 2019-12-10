/**
 * module, requires and exports are no general keywords.
 * Only in the context of an ModuleDescritor(module-info.java)
 */
module jdk9 {
    // Module Meta Data goes here.

    // expose only specific packages
    exports modules.server;

    // Import other modules
    // requires modules.exports;
}