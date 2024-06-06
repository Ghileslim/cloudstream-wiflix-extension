// Utiliser un entier pour les numéros de version
version = 1

cloudstream {
    language = "fr"
    // Toutes ces propriétés sont optionnelles, vous pouvez les supprimer en toute sécurité

    description = "WIFLIX, le site grâce auquel vous allez pouvoir regarder vos films et séries préférées"
    authors = listOf("Eddy")

    /**
     * Statut int comme suit:
     * 0: Hors ligne
     * 1: OK
     * 2: Lent
     * 3: Beta uniquement
     */
    status = 1 // sera 3 si non spécifié
    tvTypes = listOf(
        "TvSeries",
        "Movie"
    )

    iconUrl = "https://www.google.com/s2/favicons?domain=wiflix.promo&sz=%size%"
}

// Mettre à jour toutes les autres URL vers le nouveau domaine
val baseUrl = "http://wiflix.promo"
